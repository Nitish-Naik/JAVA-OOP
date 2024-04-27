// is a special keyword which is invoked automatically at the time of object creation..
// 1.. have the same name as the class or structure
// 2.. dont have return type (Not even void)
// 3.. called only once
// 4.. memory allocation happpens when constructor is called
public class constructors 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Nitish");
        System.out.println(s1.name);
    }    
}


class Student
{
    String name;
    int age;

    Student(String name) 
    {
        this.name = name;
        System.out.println("Constructor is called!!!");
    }
}

// Types of constructors
// 1.. Non - parameterizex
// 2.. Parameterized
// 3.. Copy constructor {
    