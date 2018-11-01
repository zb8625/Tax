package cis104mmachineproject;

// Class containing all methods for calculating the components of the
// Income Tax Calculator 

public class IncomeTaxCalculator {
    double monthlyGrossIncome; // User-defined monthly gross income
    int numDependents;         // number of dependents of user (up to 4 only)
    boolean isUserMarried;     // Civil Status of user
    String employmentStatus;   // Employment Status of user (Employed or Self-Employed)
    String userName;           // Name of user
    
    public IncomeTaxCalculator(
            double userIncome,
            int userDependents,
            boolean userCivil,
            String userStatus,
            String nameGiven
    )
    {
        monthlyGrossIncome = userIncome;
        numDependents = userDependents;
        isUserMarried = userCivil;
        employmentStatus = userStatus;
        userName = nameGiven;
    }
    
    public String getName(){
        return userName;
    }
    
    public double calculateAnnualIncomeOld(){
        if (monthlyGrossIncome <= 82000){
            return monthlyGrossIncome * 12;
        }
        else {
            return monthlyGrossIncome * 12 + monthlyGrossIncome - 82000;
        }
    }
    
    public double calculateAnnualIncomeNew(){
        if (monthlyGrossIncome <= 90000){
            return monthlyGrossIncome * 12;
        }
        else {
            return monthlyGrossIncome * 12 + monthlyGrossIncome - 90000;
        }
    }
    
    
    public double getPAGIBIGDeduction(){
        return 100.00;
    }
    
    public double getSSSDeduction(){
        double result = 0;
        if (monthlyGrossIncome>=1000.00&&monthlyGrossIncome<=1249.99){
            if ("e".equals(employmentStatus)) {
                result = 36.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 110.00;
            }
        }
        else if (monthlyGrossIncome>=1250.00&&monthlyGrossIncome<=1749.99){
            if ("e".equals(employmentStatus)) {
                result = 54.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 165.00;
            }
        }
        else if (monthlyGrossIncome>=1750.00&&monthlyGrossIncome<=2249.99){
            if ("e".equals(employmentStatus)) {
                result = 72.70;
            }
            else if ("se".equals(employmentStatus)) {
                result = 220.00;
            }
        }
        else if (monthlyGrossIncome>=2250.00&&monthlyGrossIncome<=2749.99){
            if ("e".equals(employmentStatus)) {
                result = 90.80;
            }
            else if ("se".equals(employmentStatus)) {
                result = 275.00;
            }
        }
        else if (monthlyGrossIncome>=2750.00&&monthlyGrossIncome<=3249.99){
            if ("e".equals(employmentStatus)) {
                result = 109.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 330.00;
            }
        }
        else if (monthlyGrossIncome>=3250.00&&monthlyGrossIncome<=3749.99){
            if ("e".equals(employmentStatus)) {
                result = 127.20;
            }
            else if ("se".equals(employmentStatus)) {
                result = 385.00;
            }
        }
        else if (monthlyGrossIncome>=3750.00&&monthlyGrossIncome<=4249.99){
            if ("e".equals(employmentStatus)) {
                result = 145.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 440.00;
            }
        }
        else if (monthlyGrossIncome>=4250.00&&monthlyGrossIncome<=4749.00){
            if ("e".equals(employmentStatus)) {
                result = 163.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 495.00;
            }
        }
        else if (monthlyGrossIncome>=4750.00&&monthlyGrossIncome<=5249.99){
            if ("e".equals(employmentStatus)) {
                result = 181.70;
            }
            else if ("se".equals(employmentStatus)) {
                result = 550.00;
            }
        }
        else if (monthlyGrossIncome>=5250.00&&monthlyGrossIncome<=5749.99){
            if ("e".equals(employmentStatus)) {
                result = 199.80;
            }
            else if ("se".equals(employmentStatus)) {
                result = 605.00;
            }
        }    
        else if (monthlyGrossIncome>=5750.00&&monthlyGrossIncome<=6249.99){
            if ("e".equals(employmentStatus)) {
                result = 218.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 660.00;
            }            
        }
        else if (monthlyGrossIncome>=6250.00&&monthlyGrossIncome<=6749.99){
            if ("e".equals(employmentStatus)) {
                result = 236.20;
            }
            else if ("se".equals(employmentStatus)) {
                result = 715.00;
            }            
        }
        else if (monthlyGrossIncome>=6750.00&&monthlyGrossIncome<=7249.99){
            if ("e".equals(employmentStatus)) {
                result = 254.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 770.00;
            }            
        }
        else if (monthlyGrossIncome>=7250.00&&monthlyGrossIncome<=7749.99){
            if ("e".equals(employmentStatus)) {
                result = 272.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 825.00;
            }            
        }
        else if (monthlyGrossIncome>=7750.00&&monthlyGrossIncome<=8249.99){
            if ("e".equals(employmentStatus)) {
                result = 290.70;
            }
            else if ("se".equals(employmentStatus)) {
                result = 880.00;
            }            
        }
        else if (monthlyGrossIncome>=8250.00&&monthlyGrossIncome<=8749.99){
            if ("e".equals(employmentStatus)) {
                result = 308.80;
            }
            else if ("se".equals(employmentStatus)) {
                result = 935.00;
            }            
        }
        else if (monthlyGrossIncome>=8750.00&&monthlyGrossIncome<=9249.99){
            if ("e".equals(employmentStatus)) {
                result = 327.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 990.00;
            }            
        }
        else if (monthlyGrossIncome>=9250.00&&monthlyGrossIncome<=9749.99){
            if ("e".equals(employmentStatus)) {
                result = 345.20;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1045.00;
            }            
        }
        else if (monthlyGrossIncome>=9750.00&&monthlyGrossIncome<=10249.99){
            if ("e".equals(employmentStatus)) {
                result = 363.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1100.00;
            }            
        }
        else if (monthlyGrossIncome>=10250.00&&monthlyGrossIncome<=10749.99){
            if ("e".equals(employmentStatus)) {
                result = 381.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1155.00;
            }            
        }
        else if (monthlyGrossIncome>=10750.00&&monthlyGrossIncome<=11249.99){
            if ("e".equals(employmentStatus)) {
                result = 399.70;
            }
            else if ("se".equals(employmentStatus)) {
                result = 990.00;
            }            
        }
        else if (monthlyGrossIncome>=11250.00&&monthlyGrossIncome<=11749.99){
            if ("e".equals(employmentStatus)) {
                result = 417.80;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1265.00;
            }            
        }
        else if (monthlyGrossIncome>=11750.00&&monthlyGrossIncome<=12249.99){
            if ("e".equals(employmentStatus)) {
                result = 436.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1320.00;
            }            
        }
        else if (monthlyGrossIncome>=12250.00&&monthlyGrossIncome<=12749.99){
            if ("e".equals(employmentStatus)) {
                result = 454.20;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1375.00;
            }            
        }
        else if (monthlyGrossIncome>=12750.00&&monthlyGrossIncome<=13249.99){
            if ("e".equals(employmentStatus)) {
                result = 472.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1430.00;
            }            
        }
        else if (monthlyGrossIncome>=13250.00&&monthlyGrossIncome<=13749.99){
            if ("e".equals(employmentStatus)) {
                result = 490.50;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1485.00;
            }            
        }
        else if (monthlyGrossIncome>=13750.00&&monthlyGrossIncome<=14249.99){
            if ("e".equals(employmentStatus)) {
                result = 508.70;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1540.00;
            }            
        }
        else if (monthlyGrossIncome>=14250.00&&monthlyGrossIncome<=14749.99){
            if ("e".equals(employmentStatus)) {
                result = 526.80;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1595.00;
            }            
        }
        else if (monthlyGrossIncome>=14750.00&&monthlyGrossIncome<=15249.99){
            if ("e".equals(employmentStatus)) {
                result = 545.00;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1650.00;
            }            
        }
        else if (monthlyGrossIncome>=15250.00&&monthlyGrossIncome<=15749.99){
            if ("e".equals(employmentStatus)) {
                result = 563.20;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1705.00;
            }            
        }
        else if (monthlyGrossIncome>=15750.00){
            if ("e".equals(employmentStatus)) {
                result = 581.30;
            }
            else if ("se".equals(employmentStatus)) {
                result = 1760.00;
            }            
        }
        
        return result;        
    }
    
}


