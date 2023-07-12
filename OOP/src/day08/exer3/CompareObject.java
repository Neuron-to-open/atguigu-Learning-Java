package day08.exer3;

/**
 * DATE: 2022/11/9
 * Author: yjy --- BUPT
 */
/*
 * interface CompareObject{
	public int compareTo(Object o);
	//若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
 }

 */
public interface CompareObject {
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}

