package controle;

import modelo.Login;
import visao.JanelaLogin;

public class ProgramaPrincipalLogin {
	public static void main(String[] args) {
		JanelaLogin j= new JanelaLogin();
		j.setVisible(true);
		Login l = new Login();
		ControleLogin conLog = new ControleLogin(j, l);
	}
}
