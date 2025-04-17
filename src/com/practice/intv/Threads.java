package com.practice.intv;

public class Threads extends Thread {
	
	
	public void run() {
		System.out.println("hey its thread--> "+getName());
	}

	public static void main(String[] args) {
		
		
		Threads th1=new Threads();
		Threads th2=new Threads();
		
		
//		th2.run();
//		th1.run();   these both run method run as a single thread and if use start which exicute there and run method get cllled 
		th2.start();;
		th2.start();;
		

	}
}
//
//}




////using runnable
//package com.practice.intv;
//
//import java.util.jar.Attributes.Name;
//
//public class Threads implements Runnable {
//	
//	
//	public void run() {
//		System.out.println("hey its thread--> "+Thread.currentThread().getName());
//	}
//
//	public static void main(String[] args) {
//		
//		Runnable r1=new Threads();
//		
//		
//		Thread th1=new Thread(r1);
//		
////		Thread th2=new Thread();
//		th1.setName("first thread");
//		
//		th1.start();
//		
//		
//
//	}
//
//}

//public class Threads implements Runnable {
//    private String username;
//    private String password;
//
//    public Threads(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    @Override
//    public void run() {
//        // Simulate login process (replace with actual authentication logic)
//        if ("admin".equals(username) && "password".equals(password)) {
//            System.out.println("User " + username + " logged in successfully."+Thread.currentThread().getName());
//        } else {
//            System.out.println("Login failed for user " + username);
//        }
//    }
//    
//    public static void main(String[] args) {
////		
//		Runnable r1=new Threads("admin","password");
//		
//		
//		Thread th1=new Thread(r1);
//		
////		Thread th2=new Thread();
//		th1.setName("first thread");
//		
//		th1.start();
//		
//		
//
//	}
//}
