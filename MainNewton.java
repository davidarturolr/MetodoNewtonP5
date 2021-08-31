package metodoNewton;

public class MainNewton {
	public double raiz(IFuncion f, IFuncion df, double x, double error, int ciclos) {
		double r=Double.NaN;
		int k =0;
		while(Math.abs(f.evaluador(x))>error && k<ciclos) {
		x=x-f.evaluador(x)/df.evaluador(x);
		k++;
		}
		
		if(k<ciclos) r=x;
		return r;
		
		
		
	}

}
