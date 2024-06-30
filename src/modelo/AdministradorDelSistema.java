package modelo;

public class AdministradorDelSistema {

    // Credenciales fijas para la autenticación
    private static final String nombreUsuarioCorrecto = "PepitoPro";
    private static final String contraseñaCorrecta = "1234";

    // Método estático para autenticar
    public static boolean autenticar(String usuario, String contraseña) {
        return usuario.equals(nombreUsuarioCorrecto) && contraseña.equals(contraseñaCorrecta);
    }
}
