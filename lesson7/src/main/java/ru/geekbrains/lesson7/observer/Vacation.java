package ru.geekbrains.lesson7.observer;

public class Vacation {

    private int vacancyId;
    private String companyName;
    private int salary;


    private static int idCounter = 1000;

    {
        vacancyId = idCounter++;
    }

    public Vacation(String companyName, int salary) {
        this.companyName = companyName;
        this.salary = salary;

    }

    /**
     * @return String return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return int return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }



    /**
     * @return int return the vacancyId
     */
    public int getVacancyId() {
        return vacancyId;
    }

    /**
     * @param vacancyId the vacancyId to set
     */
    public void setVacancyId(int vacancyId) {
        this.vacancyId = vacancyId;
    }

    @Override
    public String toString() {
        return String.format("\n[Вакансия #%d] %s - %d руб.\n", this.vacancyId, this.companyName, this.salary);
    }

}