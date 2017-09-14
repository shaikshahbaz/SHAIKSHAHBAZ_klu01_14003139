

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;


/**
 
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
                int d=length;
	}


	public Student[] getStudents() {
		if(students.length==0)
		return null;
                else
                {
                    return students;
                }
	}

        @Override
	public void setStudents(Student[] students) {
		this.students=students;
	}

	
	public Student getStudent(int index) {
		if(students.length==0)
		return null;
                else
                    return students[index];
	}


        @Override
	public void setStudent(Student student, int index) {
        this.students[index]=student;
	}

	
        @Override
	public void addFirst(Student student) {
		// Add your implementation here
	this.students[0]=student;
        
        }

	
        @Override
	public void addLast(Student student) {
		// Add your implementation here
                int d=students.length;
	this.students[d-1]=student;
        
        }

	public void add(Student student, int index) {
		 int d=this.students.length;
                 this.students[index]=student;
                 int i;
                 for(i=index;i<d;i++)
                 {
                     
                 }
	}

	
	public void remove(int index) {
		int i=0;
                int d=this.students.length;
                for(i=index;i<d;i++)
                {
                    if(i!=d-1)
                    this.students[i]=students[i+1];
                    if(i==d-1)
                    {
                          this.students[i]=students[i+1];
                          break;
                    }
                }
	}

	public void remove(Student student) {
            student=null;
	}

	public void removeFromIndex(int index) {
		int i;
                int d=this.students.length;
                for(i=index;i<d;i++)
                {
                    this.students[i]=null;
                }
	}

        @Override
	public void removeFromElement(Student student) {
		int i;
                int g=0;
                for(i=0;i<this.students.length;i++)
                {
                    if(this.students[i]==student)
                       g=i;
                }
                int d=this.students.length;
                         for(i=g;i<d;i++)
                {
                    if(i!=d-1)
                    this.students[i]=students[i+1];
                    if(i==(d-1))
                    {
                          this.students[i]=students[i+1];
                          break;
                    }
                }
                }
	

        @Override
	public void removeToIndex(int index) {
		int i;

                for(i=0;i<=index;i++)
                {
                    this.students[i]=null;
                }
    
	}

        @Override
	public void removeToElement(Student student) {
	int i;
                int g=0;
                for(i=0;i<this.students.length;i++)
                {
                    if(this.students[i]==student)
                       g=i;
                }
                int d=this.students.length;
                         for(i=0;i<g;i++)
                {
                    this.students[i]=null;
                }
                }
	

	public void bubbleSort() {
	int i;
        Student a;
        
         int d=this.students.length;
        for(i=0;i<d;i++)
        {
            for(int j=0;j<d-1;j++)
            {
                
                  a=this.students[j];
                  this.students[j]=this.students[j+1];
                  this.students[j+1]=a;
                } 
                }
            }
        
	

        @Override
	public Student[] getByBirthDate(Date date) {
		if(this.students.length==0)
		return null;
                else
                {
		int i;
                for(i=0;i<this.students.length;i++)
                {
                    if(this.students[i].getBirthDate()==date)
                    {
                        return this.students;
                  
                }  
                                         
                
	}
                return null;
        }
                
        }

	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
	  int g1=0;
                int g2=0;	
            if(this.students.length==0)
		return null;
              
                else
                {
		int i;
                for(i=0;i<this.students.length;i++)
                {
                    if(this.students[i].getBirthDate()==firstDate)
                    {
                        g1=i;
                  
                }  
                      if(this.students[i].getBirthDate()==lastDate)
                    {
                        g2=i;
                  
                }
                }
                
                 for(i=g1;i<=g2;i++)
                     
                        {
                        return this.students;
                        }
                     
	}
                return null;
	}
        @Override
	public Student[] getNearBirthDate(Date date, int days) {
return null;
        }
        @Override
	public int getCurrentAgeByDate(int indexOfStudent) {
	return 0;
	
	}

        @Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

        @Override
	public Student[] getStudentsWithMaxAvgMark() {
		
		if(this.students.length==0)
		return null;
else{

int i;
int d=this.students.length;
double avg=this.students[0].getAvgMark();
              
{
   for(i=1;i<d;i++)
   {
       if(avg<this.students[i].getAvgMark())
           avg=this.students[i].getAvgMark();
   }
}


// Add your implementation here
		return null;
	}
	}

        @Override
	public Student getNextStudent(Student student) {
		int i;
                int g=0;
                int d=this.students.length;
                if(d==0)
                    return null;
                else
                {
                    for(i=0;i<d;i++)
                    {
                        if(this.students[i]==student)
                        g=i;    
                    }
                    return this.students[g+1];
                }
		
	}
}
