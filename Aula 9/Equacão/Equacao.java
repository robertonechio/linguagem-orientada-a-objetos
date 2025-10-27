public class Equacao {
    public static double raizEq2GrauX1(double a, double b, double c) throws NaoTemRaizesReaisException {
        double delta = b * b - 4 * a *c;
        if (delta < 0) {
            throw new NaoTemRaizesReaisException("A equação não tem raízes reais. (Δ < 0).");
        }
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
    public static double raizEq2GrauX2(double a, double b, double c) throws NaoTemRaizesReaisException {
        double delta = b * b - 4 * a *c;
        if (delta < 0) {
            throw new NaoTemRaizesReaisException("A equação não tem raízes reais. (Δ < 0).");
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
    public static double raizEq2GrauX1_RT(double a, double b, double c) throws NaoTemRaizesReaisRuntimeException {
        double delta = b * b - 4 * a *c;
        if (delta < 0) {
            throw new NaoTemRaizesReaisRuntimeException("A equação não tem raízes reais. (Δ < 0).");
        }
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
    public static double raizEq2GrauX2_RT(double a, double b, double c) throws NaoTemRaizesReaisRuntimeException {
    double delta = b * b - 4 * a *c;
        if (delta < 0) {
            throw new NaoTemRaizesReaisRuntimeException("A equação não tem raízes reais. (Δ < 0).");
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}
