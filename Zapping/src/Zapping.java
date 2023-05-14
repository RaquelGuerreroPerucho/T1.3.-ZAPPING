public class Zapping {
    public static int cambioCanal(int cA, int cB) {

        int pasar;

        if (cA < cB) {
            if (cA < 50 && cB > 50) {
                pasar = (cA + 99) - cB;
            } else {
                pasar = cB - cA;
            }
        } else {
            if (cA > 50 && cB < 50) {
                pasar = (cB + 99) - cA;
            } else {
                pasar = cA - cB;
            }
        }
        return pasar;
    }
}
