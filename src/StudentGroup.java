
import java.util.*;
class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) { //tested
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents(){
		if(students.length>0)
		  return students;
        return null;
	}

	@Override
	public void setStudents(Student[] student) throws IllegalArgumentException{
		// Add your implementation here
        if(student==null)
            throw new IllegalArgumentException();
		for(int i=0;i<student.length;i++)
			students[i]=student[i];
	}

	@Override
	public Student getStudent(int index)  throws IllegalArgumentException{
		// Add your implementation here
		if(index>=0&&index<students.length)
			return students[index];
        else
           throw new IllegalArgumentException(); 
	
	}

	@Override
	public void setStudent(Student student, int index) throws IllegalArgumentException{  //tested
		// Add your implementation here
       if(student==null)
           throw new IllegalArgumentException(); 
       if(index>=0&&index<students.length) 
		 students[index]=student;
       else
        throw new IllegalArgumentException(); 
	}

	@Override
	public void addFirst(Student student) throws IllegalArgumentException{
		if(student==null)
           throw new IllegalArgumentException(); 
        int i;
		if(students.length==0)
			students[0]=student;
		else
		{ 
            Student a;
            for(i=0;i<students.length&&(a=this.getStudent(i))!=null;i++);
			for(;i>0;i--){
				students[i]=students[i-1];
            }
			students[0]=student;
		}
	}

	@Override
	public void addLast(Student student) throws IllegalArgumentException{ //tested
		// Add your implementation here
        if(student==null)
           throw new IllegalArgumentException(); 
        int i;
        Student a;
        for(i=0;i<students.length&&(a=this.getStudent(i))!=null;i++);
		this.setStudent(student, i);
	}

	@Override
	public void add(Student student, int index) throws IllegalArgumentException{
		// Add your implementation here
        if(student==null)
           throw new IllegalArgumentException(); 
        if(index<0&&index>=students.length) 
            throw new IllegalArgumentException(); 
        int len;
        Student a;
        for(len=0;len<students.length&&(a=this.getStudent(len))!=null;len++);
        if(index==0)
            this.addFirst(student);
        else if(index==len)
            this.addLast(student);
        else
        {
            for(int i=len;i!=index;i--)
                students[i]=students[i-1];
            this.setStudent(student,index);
        }		
	}
	@Override
    public void remove(int index) throws IllegalArgumentException//tested
    {
        int len,i;
        Student a;
        if(index<0&&index>=students.length) 
            throw new IllegalArgumentException(); 
        for(len=0;len<students.length&&(a=this.getStudent(len))!=null;len++);
        if(index==len-1)
           students[len-1]=null;
        else
        {
            for(i=index;i<len-1;i++)
            {
                students[i]=students[i+1];
            }
            students[len-1]=null;
        }
        
    }
	@Override
	public void remove(Student student) throws IllegalArgumentException//tested
    {
        int i;
        if(student==null)
           throw new IllegalArgumentException(); 
        for(i=0;i<students.length;i++){
            if(students[i].equals(student)){
                this.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("Student not exist");
    }
	@Override
	public void removeFromIndex(int index) throws IllegalArgumentException//tested
    {
        int len;
        Student a;
        if(index<0&&index>=students.length) 
            throw new IllegalArgumentException(); 
        for(len=0;len<students.length&&(a=this.getStudent(len))!=null;len++);
        for(int i=index+1;i<len;i++)
            students[i]=null;
    }
	@Override
	public void removeFromElement(Student student) throws IllegalArgumentException//tested
    {
        
        for(int i=0;;i++){
            if(students[i].equals(student)){
                this.removeFromIndex(i);
                return;
            }
        }
    }
	@Override
	public void removeToIndex(int index) throws IllegalArgumentException//tested
    {
        if(index<0&&index>=students.length) 
            throw new IllegalArgumentException(); 
        for(int i=0;i!=index;i++){
            this.remove(0);
            System.out.println(i);
        }
       
    }
	@Override
	public void removeToElement(Student student) throws IllegalArgumentException//tested
    {
        for(int i=0;;i++){
            if(students[i].equals(student)){
                this.removeToIndex(i);
                return;
            }
        }
    }
	@Override
	public void bubbleSort(){//tested
        int len,i,j;
        Student a;
        for(len=0;len<students.length&&(a=this.getStudent(len))!=null;len++);
        for(i=0;i<len-1;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(students[i].compareTo(students[j])>0){
                    a=students[i];
                    students[i]=students[j];
                    students[j]=a;
                }
            }
        }
        
    }
	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}

	
