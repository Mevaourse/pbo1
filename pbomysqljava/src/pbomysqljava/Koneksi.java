package pbomysqljava;
import java.sql.*;
import java.util.Scanner;

public class Koneksi { 
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/latian";
	static final String USER = "root";
	static final String PASS = "danielnw123";
	
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
            System.out.println("Pilih metode yang akan dilakukan:");
            System.out.println("1. Insert");
            System.out.println("2. Show");
            System.out.println("3. Hapus data");
            System.out.println("4. Exit");
            System.out.print("Masukkan pilihan (1/2/3/4): ");
            int pilihan = scanner.nextInt();
            
            switch(pilihan) {
                case 1:
                    insert(scanner);
                    break;
                case 2:
                    show();
                    break;
                case 3:
                	delete(scanner);
                	break;
                case 4:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
		}
	}
	
	public static void insert(Scanner scanner) {
		System.out.print("Masukkan ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();  // Consume newline
		
		System.out.print("Masukkan Judul Buku: ");
		String judul_buku = scanner.nextLine();
		
		System.out.print("Masukkan Tahun Terbit: ");
		int tahun_terbit = scanner.nextInt();
		
		System.out.print("Masukkan Stok: ");
		int stok = scanner.nextInt();
		
		System.out.print("Masukkan Penulis (ID Penulis): ");
		int penulis = scanner.nextInt();
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			
			String sql = "INSERT INTO buku (id, judul_buku, tahun_terbit, stok, penulis) VALUES (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			ps.setString(2, judul_buku);
			ps.setInt(3, tahun_terbit);
			ps.setInt(4, stok);
			ps.setInt(5, penulis);
			
			ps.execute();
			
			stmt.close();
			conn.close();
			System.out.println("Data berhasil dimasukkan.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void show() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM buku");
			int i = 1;
			while(rs.next()) {
				System.out.println("Data ke-" + i);
				System.out.println("Kode Barang: " + rs.getInt("id"));
				System.out.println("Judul Buku: " + rs.getString("judul_buku"));
				System.out.println("Tahun Terbit: " + rs.getInt("tahun_terbit"));
				System.out.println("Stok: " + rs.getInt("stok"));
				System.out.println("Penulis: " + rs.getInt("penulis"));
				i++;
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(Scanner scanner) {
		System.out.println("Masukkan ID barang yang ingin dihapus : ");
		int id = scanner.nextInt();
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
			
			String sql = "delete from buku where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1,id);
			
			int rowsAffected = ps.executeUpdate();
			
			if (rowsAffected > 0 ) {
				System.out.println("Data berhasil dihapus");
			}
			else {
				System.out.println("Data invalid");
			}
			
			stmt.close();
			conn.close();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void edit(Scanner scanner) {
       	 	System.out.print("Masukkan ID buku yang akan diedit: ");
        	int id = scanner.nextInt();
        	scanner.nextLine();  
        
        	System.out.print("Masukkan Judul Buku baru: ");
        	String judul_buku = scanner.nextLine();
        
       		System.out.print("Masukkan Tahun Terbit baru: ");
        	int tahun_terbit = scanner.nextInt();
        
        	System.out.print("Masukkan Stok baru: ");
        	int stok = scanner.nextInt();
        
        	System.out.print("Masukkan Penulis baru (ID Penulis): ");
        	int penulis = scanner.nextInt();
        
        	try {
            		Class.forName(JDBC_DRIVER);
            		conn = DriverManager.getConnection(DB_URL, USER, PASS);
            		stmt = conn.createStatement();
            
	            	String sql = "UPDATE buku SET judul_buku = ?, tahun_terbit = ?, stok = ?, penulis = ? WHERE id = ?";
            		PreparedStatement ps = conn.prepareStatement(sql);
            
            		ps.setString(1, judul_buku);
           		ps.setInt(2, tahun_terbit);
            		ps.setInt(3, stok);
            		ps.setInt(4, penulis);
            		ps.setInt(5, id);
            
            		int rowsAffected = ps.executeUpdate();
            
            		if (rowsAffected > 0) {
                		System.out.println("Data berhasil diupdate.");
            		} else {
                		System.out.println("ID tidak ditemukan.");
            		}
            
            		stmt.close();
            		conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
