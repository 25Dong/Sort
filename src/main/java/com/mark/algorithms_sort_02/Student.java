package com.mark.algorithms_sort_02;

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	//实现接口中的方法
	//如果分数相等的话，则按照名字的字母排序;果分数不等则按照,则分数高的靠前
	public int compareTo(Student s) {
		if(s.score == this.score){
			return this.name.compareTo(s.name);
		}
		if(this.score < s.score){
			return 1;
		}else if(this.score > s.score){
			return -1;
		}else{
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Student: "+this.name+""+Integer.toString(score);
	}


}
