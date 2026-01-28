package com.placement;

import java.util.Scanner;

class vehicle{
	private String ownerName;
	private String vehicleNumber;
	private String vehicleType;
	public vehicle(String ownerName, String vehicleNumber, String vehicleType) {
		
		this.ownerName = ownerName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}
	
	public void profile() {
		System.out.println("Owner Name "+ ownerName);
		System.out.println("VehicleNumber "+ vehicleNumber);
		System.out.println("vehicleType  "+ vehicleType);
	}
	
	
}
class ServiceVehicle extends vehicle{
	private String serviceCenterName;
	private String serviceCategory;
	
	public ServiceVehicle(String ownerName, String vehicleNumber, String vehicleType, String serviceCenterName,
			String serviceCategory) {
		
		
		super(ownerName, vehicleNumber, vehicleType);
		this.serviceCenterName = serviceCenterName;
		this.serviceCategory = serviceCategory;
		System.out.println("vehicle profile has been created.");
	}
	
	public void updateServiceCenter(String newCenterName) {
		if(newCenterName == null || newCenterName.equals("")) {
			System.out.println("Data not valid please enter proper details");
		}else {
			serviceCenterName =newCenterName;
			System.out.println("Service Center Name has been updated");
		}
		
	}
	public void updateServiceCategory(String newCategory) {
		if(newCategory == null || newCategory.equals("")) {
			System.out.println("Data not valid Please enter proper details");
		}else {
			serviceCategory =newCategory;
		}
	}
	public void profileDetaiils() {
		System.out.println("Profile Details");
		profile();
		System.out.println("Service Center Name "+ serviceCenterName);
		System.out.println("Service category "+ serviceCategory);
	}
	
	
}



public class VehicleManagementSystem {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);	
     System.out.println("Enter Owner Name :");
     String name=sc.nextLine();
     System.out.println("Enter Vehicle Number : ");
     String number=sc.nextLine();
     System.out.println("Enter Vehicle Type :");
     String type=sc.nextLine();
     System.out.println("Service Center Name : ");
     String center=sc.nextLine();
     System.out.println("Enter Service Category :");
     String categoryString=sc.nextLine();
     
        ServiceVehicle sv =new ServiceVehicle(name, number, type, center, categoryString);
     
        
        int choice=0;
        boolean status=true;
        while(status) {
        	System.out.println("Provide a menu to perform the following operations:\r\n"
        			+ "1. Update Service Category\r\n"
        			+ "2. Update Service Center Name\r\n"
        			+ "3. View Vehicle Profile Details\r\n"
        			+ "4. Exit the program\r\n"
        			+ "");
        	       choice=sc.nextInt();
        	       sc.nextLine();
        	       
        	       switch (choice) {
				case 1: {
					System.out.println("update service category : ");
					String cat=sc.nextLine();
					sv.updateServiceCategory(cat);
					break;
					
				}
				case 2: {
					System.out.println("update service center : ");
					String centerName=sc.nextLine();
					sv.updateServiceCenter(centerName);
					break;
					
				}
				case 3: {
					sv.profileDetaiils();
					break;
					
				}
				case 4: {
					System.out.println("Thank You !");
					status=false;
					break;
					
				}
				default:
					System.out.println("invlid choice");
				}
        	
        }
        
        
     
     sc.close();

	}

}
