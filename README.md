# Activité Pratique N°5 - Web services SOAP
  
Dans ce TP, nous allons développer, déployer et tester un service web SOAP en utilisant JAX-WS pour la gestion de comptes bancaires. Les principales fonctionnalités de ce service incluent la conversion de montants d'euros en dirhams (DH), la consultation des comptes individuels et l'affichage d'une liste de comptes.

## Creation de service web
- Tout d'abord, il est nécessaire de créer une application Java Maven simple en ajoutant la dépendance suivante :<br/>
  <img src="https://github.com/otari2002/soap-TP/assets/53525728/63beef6a-29e9-4d14-bcad-f2ace368062a" width="400">
  <br><br>
- Le modèle de données Compte doit être créé avec un constructeur complet (avec tous les paramètres) et un constructeur par défaut (sans paramètres), ainsi que les getters et setters appropriés.
- Le service web doit être annoté avec `@WebService`, en spécifiant le nom du service via serviceName, et les méthodes doivent être annotées avec `@WebMethod`.
## Deployer le service web 
Pour déployer le service web, nous créons une application principale qui appelle la méthode Endpoint.publish pour lancer le service.
```
public class ServiceJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:9090/";
        Endpoint.publish(url, new BankService());
        System.out.println("Web service started at " + url);
    }
}
```
## Tester les opérations du web service avec SoapUI
-  Convertir un montant de l’EURO en DH<br/><br/>
<img src="https://github.com/otari2002/soap-TP/assets/53525728/0ecb28f2-a0f6-41c8-9a87-59e773fec1e6" width="1000">
  <br>
-  Consulter un Compte<br/><br/>
<img src="https://github.com/otari2002/soap-TP/assets/53525728/fde93b54-bba1-4026-9b36-3dde43741a3c" width="1000">
<br>
-  Consulter une Liste de comptes<br/><br/>
<img src="https://github.com/otari2002/soap-TP/assets/53525728/2149e457-7834-4271-af8a-712b78ecac02" width="1000"><br/>

## Client SOAP Java <br/>
-  Premierement il faut ajouter la meme dépendance  :<br/><br/>
  <img src="https://github.com/otari2002/soap-TP/assets/53525728/63beef6a-29e9-4d14-bcad-f2ace368062a" width="400">
  <br><br>
- Generer le proxy en utilisant le plugin `Jakarta EE: Web Services (JAX-WS)` dans IntellIJ :<br/><br/>
<img src="https://github.com/otari2002/soap-TP/assets/53525728/7d16ba6a-66da-44de-8c68-cf0d7aaab07e" width="300">
<br>
- Tester les methodes de service web :<br/><br/>
<img src="https://github.com/otari2002/soap-TP/assets/53525728/78e34159-8f0e-4328-9fbc-ee19350f6b2b" width="700">
