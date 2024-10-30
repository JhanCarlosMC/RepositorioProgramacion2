package co.edu.uniquindio.patronesComportamiento.observer.newsagency;

public class MainObserver {

  public static void main(String[] args) {
    NewsAgency newsAgency = new NewsAgency();

    // Crear canales de noticias y suscribirlos
    NewsChannel websiteChannel = new NewsChannel("Website Channel");
    NewsChannel mobileAppChannel = new NewsChannel("Mobile App Channel");
    NewsChannel socialMediaChannel = new NewsChannel("Social Media Channel");

    newsAgency.registerObserver(websiteChannel);
    newsAgency.registerObserver(mobileAppChannel);
    newsAgency.registerObserver(socialMediaChannel);

    // Publicar una noticia
    newsAgency.setNews("Breaking News: New technology launched!");

    // Publicar otra noticia
//    newsAgency.setNews("Update: Stock prices soaring!");
  }
}
