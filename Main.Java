
 classe  pública Principal {

	public  static  void  main ( String [] args ) {
		Cliente  venilton = novo  Cliente ();
		venilton . setNome ( "Venilton" );
		
		Conta  cc = new  ContaCorrente ( venilton );
		Conta  poupanca = nova  ContaPoupanca ( venilton );

		cc . depositário ( 100 );
		cc . transferir ( 100 , poupanca );
		
		cc . imprimir Extrato ();
		poupanca . imprimir Extrato ();
	}

}
