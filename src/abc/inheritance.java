package abc;

class Employee{  
	 float salary=40000;  
	}  
	class inheritance  extends Employee{  
	 int bonus=10000;  
	 public static void main(String args[]){  
		 inheritance p=new inheritance();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}  