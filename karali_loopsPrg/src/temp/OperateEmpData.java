package temp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OperateEmpData {
	
	public static void main(String[] args) {
		ArrayList<Emp> empList= new ArrayList<Emp>();
		empList.add(new Emp(12,"Bhushan","Junior Developer",22000));
		empList.add(new Emp(14,"Karali","Junior Tester",82000));
		empList.add(new Emp(17,"Saurabh","Senior Developer",62000));
		empList.add(new Emp(16,"Godu","Team Lead",42000));
		
		//List<Emp> list=empList.stream().filter(a->a.salary>50000?true:false).collect(Collectors.toList());
		
		empList.stream().map(e->{
			 if(e.salary<50000) {
				 e.salary=50000;
				 return e;
			 }
			 return e;
		 }).collect(Collectors.toList());
		
		empList.stream().forEach(emp->System.out.println(emp.name+" "+emp.designation+" "+emp.salary));
		
		List<Emp> list = empList.stream().sorted((e1,e2)->{
			return e1.name.compareTo(e2.name);
		}).collect(Collectors.toList());
		System.out.println("====================================================================");
		list.stream().forEach(emp->System.out.println(emp.name+" "+emp.designation+" "+emp.salary));

		
	}

}
