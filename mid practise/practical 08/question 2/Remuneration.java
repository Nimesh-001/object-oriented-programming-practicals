public class Remuneration {
    double[] salary={10000.00,20000.00,10000.00,15000.00,25000.00};
    double[] bonus={10.0,5.0,15.0,20.0,10.0};

    public void calcsalary(){
        for(int i=0;i<salary.length;i++){
            salary[i] += salary[i]*(bonus[i/100]);
        }

    }

    public void printsalary(){
        for (int i=0;i<salary.length;i++){
            System.out.println("update salary: "+salary[i]);
        }

    }
}
