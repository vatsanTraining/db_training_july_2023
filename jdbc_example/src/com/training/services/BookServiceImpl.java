package com.training.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.utils.ConnectionFactory;

import java.sql.*
;public class BookServiceImpl implements CrudRepository<Book> {


	private Connection con;
	
	public BookServiceImpl() {
		super();
		
		this.con = ConnectionFactory.getMySqlConnection();
	}

	@Override
	public boolean save(Book book) {
		
		String sql = "insert into db_book_2023 values(?,?,?)";
		
		
		int rowAdded =0;
		
		 try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			 
			 pstmt.setInt(1, book.getBookNumber());
			 pstmt.setString(2, book.getBookName());
			 pstmt.setDouble(3, book.getRatePerUnit());
			 
			 rowAdded = pstmt.executeUpdate();
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return rowAdded==1?true:false;  
		
	}

	@Override
	public List<Book> findAll() {
		
	String sql = "select * from db_book_2023 ";
		
		
		List<Book> bookList =new ArrayList<>();
		
		 try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			 
			 ResultSet rs =pstmt.executeQuery();
			 
			 while(rs.next()) {
			
				 int bookNumber=rs.getInt("book_number");
				 String bookName=rs.getString("book_name");
				 double ratePerUnit=rs.getDouble("rate_per_uni");
			 
			 Book entity = new Book(bookNumber, bookName, ratePerUnit);
			 
			 bookList.add(entity);
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bookList;  
		
	}

	@Override
	public void sortedList() {
		
		//Collections.sort(this.bookList);
		
//		Collections.sort(this.bookList,new Comparator<Book>() {
//			
//			public int compare(Book obj1, Book obj2) {
//				if( obj1.getRatePerUnit()> obj2.getRatePerUnit()) return -1;
//				if( obj1.getRatePerUnit()< obj2.getRatePerUnit()) return 1;
//				return 0;
//			}
//		});
		
	}
	
	public void closeConnection() {
		
		try {
			this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
