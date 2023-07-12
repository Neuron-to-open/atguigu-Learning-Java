package day08.exer1;

/**
 * DATE: 2022/11/9
 * Author: yjy --- BUPT
 */
public class Manager extends Employee{

    private double bonus;//奖金



    public Manager(double bonus) {
        super();
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提供公司运行的效率");
    }



}
