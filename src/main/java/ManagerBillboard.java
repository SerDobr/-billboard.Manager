public class ManagerBillboard {
    private InformationPoster[] posters = new InformationPoster[0];
    private int limit;

    public ManagerBillboard() {
        this.limit = 10;

    }

    public ManagerBillboard(int limit) {
        this.limit = limit;

    }


    public void addFilm(InformationPoster poster) {

        InformationPoster[] tmp = new InformationPoster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;

    }

    public InformationPoster[] findAll() {
        return posters;
    }

    public InformationPoster[] findLast() {

        int resultLength;

        if (posters.length < limit) {
            resultLength = posters.length;
        } else {
            resultLength = limit;
        }


        InformationPoster[] tmp = new InformationPoster[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];

        }
        return tmp;
    }

}
