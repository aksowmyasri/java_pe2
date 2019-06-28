package main.java.com.stackroute.exercise2;
//class to nitiate variables and print them;
public class MemberVariable
{
    Member member = new Member();
    public String printValues(String name,int age,double salary)

    {
        member.name=name;
        member.age=age;
        member.salary=salary;
        return "Members Name:"+member.name+"\n"+"Members Age:"+member.age+"\n"+"Members Salary:"+member.salary;
    }


}
