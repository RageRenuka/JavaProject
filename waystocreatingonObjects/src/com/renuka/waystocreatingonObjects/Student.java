package com.renuka.waystocreatingonObjects;


	


	import java.io.Serializable;
	// Serializable is a process of writing/reading data to an external resource like file,network,console,database.

	public class Student implements Serializable {
		int stdid;
		String stdName;
		double stdMarks;
		 Student()
		{
			
		}
		 Student(int stdid, String stdName, double stdMarks) {
			super();
			this.stdid = stdid;
			this.stdName = stdName;
			this.stdMarks = stdMarks;
		}
		@Override
		public String toString() {
			return "Student [stdid=" + stdid + ", stdName=" + stdName + ", stdMarks=" + stdMarks + "]";
		}
		
		

	}



