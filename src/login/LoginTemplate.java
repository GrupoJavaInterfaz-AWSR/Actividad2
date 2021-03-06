package login;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
// import javax.swing.JRadioButton;
// import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginTemplate extends JFrame {

    private JPanel pDerecha, pIzquierda;
    private JLabel lTituloApp, lEslogan, lTituloLogin, lNotificaciones;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox cbTipoUsuario;
    private JButton bEntrar, bCerrar, bRegistrarse, bOpcion1, bOpcion2, bOpcion3;
    private JCheckBox checkSi, checkNo;
    private ButtonGroup grupo;
    // private JRadioButton rbOpcion1, rbOpcion2;
    // private JTextArea taSugerencias;

    public LoginTemplate() {
        super("Login Usuario");

        pIzquierda = new JPanel();
        pIzquierda.setSize(600, 500);
        pIzquierda.setLocation(0, 0);
        pIzquierda.setBackground(Color.ORANGE);
        pIzquierda.setLayout(null);
        this.add(pIzquierda);

        pDerecha = new JPanel();
        pDerecha.setSize(400, 500);
        pDerecha.setLocation(600, 0);
        pDerecha.setBackground(Color.WHITE);
        pDerecha.setLayout(null);
        this.add(pDerecha);

        lTituloApp = new JLabel("Login de Usuario");
        lTituloApp.setBounds(100, 20, 200, 30);
        lTituloApp.setForeground(Color.black);
        pIzquierda.add(lTituloApp);

        lEslogan = new JLabel("Te ayudamos a crear las mejores presentaciones");
        lEslogan.setSize(300, 20);
        lEslogan.setLocation((pDerecha.getWidth() - lEslogan.getWidth()) / 2, 40);
        lEslogan.setHorizontalAlignment(SwingConstants.CENTER);
        lEslogan.setForeground(Color.BLACK);
        pDerecha.add(lEslogan);

        lTituloLogin = new JLabel("Ingresa tus datos");
        lTituloLogin.setSize(110, 30);
        lTituloLogin.setLocation((pDerecha.getWidth() - lTituloLogin.getWidth()) / 2, 60);
        lTituloLogin.setForeground(Color.orange);
        lTituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lTituloLogin);

        lNotificaciones = new JLabel("¿Deseas recibir notificaciones?");
        lNotificaciones.setSize(250, 20);
        lNotificaciones.setLocation((pDerecha.getWidth() - lNotificaciones.getWidth()) / 2, 370);
        lNotificaciones.setForeground(Color.DARK_GRAY);
        lNotificaciones.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(lNotificaciones);

        tNombreUsuario = new JTextField("Nombre Usuario");
        tNombreUsuario.setSize(300, 40);
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth()) / 2, 120);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tNombreUsuario);

        tClaveUsuario = new JPasswordField("Clave Usuario");
        tClaveUsuario.setSize(300, 40);
        tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth()) / 2, 240);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setCaretColor(Color.BLUE);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tClaveUsuario);

        cbTipoUsuario = new JComboBox();
        cbTipoUsuario.addItem("Selecciona tema");
        cbTipoUsuario.addItem("Negro");
        cbTipoUsuario.addItem("Blanco");
        cbTipoUsuario.addItem("Gris oscuro");
        cbTipoUsuario.setSize(220, 30);
        cbTipoUsuario.setLocation((pDerecha.getWidth() - cbTipoUsuario.getWidth()) / 2, 185);
        cbTipoUsuario.setForeground(Color.DARK_GRAY);
        cbTipoUsuario.setBackground(Color.WHITE);
        ((JLabel) cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(cbTipoUsuario);

        bEntrar = new JButton("Entrar");
        bEntrar.setSize(250, 45);
        bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth()) / 2, 300);
        bEntrar.setFocusable(false);
        bEntrar.setBackground(Color.ORANGE);
        bEntrar.setForeground(Color.black);
        pDerecha.add(bEntrar);

        bCerrar = new JButton("X");
        bCerrar.setBounds(330, 10, 45, 30);
        bCerrar.setFocusable(false);
        bCerrar.setBackground(Color.orange);
        bCerrar.setForeground(Color.black);
        pDerecha.add(bCerrar);

        bRegistrarse = new JButton("Registrarse");
        bRegistrarse.setBounds(230, 420, 145, 35);
        bRegistrarse.setFocusable(false);
        bRegistrarse.setBackground(Color.ORANGE);
        bRegistrarse.setForeground(Color.black);
        pDerecha.add(bRegistrarse);

        bOpcion1 = new JButton("Privacidad de la cuenta");
        bOpcion1.setSize(250, 45);
        bOpcion1.setLocation((pIzquierda.getWidth() - bOpcion1.getWidth()) / 2, 300);
        bOpcion1.setFocusable(false);
        bOpcion1.setBackground(Color.white);
        bOpcion1.setForeground(Color.black);
        pIzquierda.add(bOpcion1);

        bOpcion2 = new JButton("Acerca de Power Point");
        bOpcion2.setSize(175, 20);
        bOpcion2.setLocation((pIzquierda.getWidth() - bOpcion2.getWidth()) / 2, 400);
        bOpcion2.setFocusable(false);
        bOpcion2.setBackground(Color.white);
        bOpcion2.setForeground(Color.black);
        pIzquierda.add(bOpcion1);
        pIzquierda.add(bOpcion2);

        checkSi = new JCheckBox("Si");
        checkSi.setSize(45, 25);
        checkSi.setFocusable(false);
        checkSi.setBackground(Color.WHITE);
        checkSi.setLocation((pDerecha.getWidth() - checkSi.getWidth()) / 2 - 15, 345);
        pDerecha.add(checkSi);

        checkNo = new JCheckBox("No");
        checkNo.setSize(45, 25);
        checkNo.setFocusable(false);
        checkNo.setBackground(Color.WHITE);
        checkNo.setLocation((pDerecha.getWidth() + checkNo.getWidth()) / 2 - 15, 345);
        pDerecha.add(checkNo);

        grupo = new ButtonGroup();
        grupo.add(checkSi);
        grupo.add(checkNo);

        // rbOpcion1 = new JRadioButton("opcion1");
        // rbOpcion1.setBounds(50, 400, 120, 30);
        // pIzquierda.add(rbOpcion1);

        // rbOpcion2 = new JRadioButton("opcion2");
        // rbOpcion2.setBounds(200, 400, 120, 30);
        // pIzquierda.add(rbOpcion2);

        // taSugerencias = new JTextArea("Escribe algo...");
        // taSugerencias.setBounds(185, 180, 230, 140);
        // pIzquierda.add(taSugerencias);

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }
}