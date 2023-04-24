package interfaces;

public class AppBancoDados  {
	public static void main(String args[]){
		InterfaceBD x;
		
	    if (args[0].equals("mysql")){
	    	x = (InterfaceBD) new DriverMySQL();
	    }
	    else{
	    	x = (InterfaceBD) new DriverOracle();
	    }
	    x.conectar("localhost");
	    x.executar("Select * from tabela");
	}

}
