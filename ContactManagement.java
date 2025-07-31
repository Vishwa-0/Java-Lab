Import java.util.*;
Class ContactManagementSystem
{
Public static void main(String[] args)
{
ArrayList<String> user = new ArrayList<String>();
Scanner sc = new Scanner(System.in);
Int choice;
Do
{
System.out.println(“********** Contact Management System **********”);
System.out.println(“\n1.Add”);
System.out.println(“2.View”);
System.out.println(“3.Update”);
System.out.println(“4.Delete”);
System.out.println(“5.Exit”);
System.out.println(“Enter your choice:”);
Choice = sc.nextInt();
Sc.nextLine();
Switch(choice)
{
Case 1:
 System.out.println(“Add New Contact”);
 System.out.println(“Enter contact name: “);
 String name = sc.nextLine();
 User.add(name);
 String contact = sc.nextLine();
 User.add(contact);
 Break;
Case 2:
 System.out.println(“View Contact List”);
 For(int I = 0; I < user.size(); i+=2)
 {
 System.out.println(“Name: “+user.get(i));
 System.out.println(“Contact: “+user.get(i+1));
 System.out.println(“--------------------“);
 }
 Break;
Case 3:
 System.out.println(“Update contact”);
 System.out.println(“Enter name to update: “);
 String old_name = sc.nextLine();
 If (user.contains(old_name))
 {
 Int index = user.indexOf(old_name);
 System.out.println(“Enter new name: “);
 String new_name = sc.nextLine();
 User.set(index, new_name);
 System.out.println(“Enter new contact: “);
 String new_contact = sc.nextLine();
 User.set(index+1, new_contact);
 System.out.println(“Updated Successfully”);
 }
 Else
 {
 System.out.println(“Contact not found”);
 }
