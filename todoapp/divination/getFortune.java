Calender today = Calendar.getInstance();
int year = today.get(Calendar.YEAR);
int month = today.get(Calendar.MONTH);
int day = today.get(Calendar.DATE);

static int calcSeed(String name, int year, int month, int day) {
    int seed = year + month + day;
    for (int i = 0; i < name.length(); i ++) {
        seed += name.CharAt(i);
    }
    return seed;
}