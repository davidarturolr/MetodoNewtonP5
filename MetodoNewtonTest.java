package metodoNewton;

public class MetodoNewtonTest {

		public static void main(String[] args) {
			
			IFuncion f = new MetodoNewton() {
				
				@Override
				public double evaluador(double x) {
					return x*x*x-x;
				}
			};
			
			IFuncion df = new MetodoNewton() {
				
				@Override
				public double evaluador(double x) {
					return 3*x*x-1;
				}
			};
			
			MainNewton newton = new MainNewton();
			
			for (int i = -100; i < -1; i++) {
				System.out.println("respuesta root -1: "+newton.raiz(f, df, i, 1e-6, 100)+ " cuando error permitido 1*10^-6 y 100 ciclos en su ejecución\n" );
			}
			
			for (int i = 1; i < 8; i++) {
				System.out.println("respuesta root 0-: "+newton.raiz(f, df, -i/8, 1e-6, 100)+ " cuando error permitido 1*10^-6 y 100 ciclos en su ejecución\n" );
			}
			for (int i = 1; i < 8; i++) {
				System.out.println("respuesta root 0+: "+newton.raiz(f, df, i/8, 1e-6, 100)+ " cuando error permitido 1*10^-6 y 100 ciclos en su ejecución\n" );
			}
			
			for (int i = 1; i < 100; i++) {
				System.out.println("respuesta root 1: "+newton.raiz(f, df, i, 1e-6, 100)+ " cuando error permitido 1*10^-6 y 100 ciclos en su ejecución\n" );
			}
				
			
			
			
			
			
		}
}
