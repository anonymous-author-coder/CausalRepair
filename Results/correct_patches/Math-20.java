public double[] repairAndDecode(final double[] x) {
    // Alternative repair implementation using Math.min/max
    if (boundaries != null && isRepairMode) {
        double[] repaired = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            repaired[i] = Math.max(0, Math.min(1.0, x[i]));
        }
        return decode(repaired);
    }
    return decode(x);
}