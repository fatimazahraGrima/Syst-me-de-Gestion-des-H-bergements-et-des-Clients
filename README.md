## Système de Gestion des Hébergements et des Clients

### Description

Cette application est un système de gestion d'hébergements permettant aux utilisateurs de réserver des chambres dans des hôtels ou des maisons d'hôte. Elle inclut les fonctionnalités suivantes :

- Gestion des hébergements (affichage, consultation).
- Réservation de chambres par les clients.
- Affichage des réservations par chaque client.

### Fonctionnalités et Interfaces

- **Page d'accueil** : Navigation vers les sections de l'application.
- ![image](https://github.com/user-attachments/assets/f56dad8f-115a-4d85-beb1-983eb01bb182)

- **Liste des hébergements** : Visualisation des hébergements disponibles.
- ![image](https://github.com/user-attachments/assets/c92f22e6-beac-48eb-a13a-3788fac6af45)

- **Liste des réservations** : Visualisation des réservations existantes.
- ![image](https://github.com/user-attachments/assets/22773e79-57ed-4884-bff9-3264908e5afa)

- **Ajout de réservation** : Enregistrement d'une nouvelle réservation pour un client et un hébergement spécifique.
![image](https://github.com/user-attachments/assets/9225c080-03e8-4d55-b28b-c3ba9d20bf3f)

---

### Pré-requis

- **Java 21** ou supérieur
- **Maven** pour la gestion des dépendances
- **MySQL** pour la base de données
- **IntelliJ IDEA** 

### Installation et Configuration

1. **Cloner le projet** :
   ```bash
   git clone https://github.com/votre-utilisateur/nom-du-repo.git
   cd nom-du-repo
   ```

2. **Configurer la base de données MySQL** :
   - Créez une base de données MySQL nommée `gestion_hebergements` (ou un autre nom de votre choix).
   - Mettez à jour les informations de connexion dans le fichier `src/main/resources/application.properties` :

     ```properties
     # Configuration de la base de données MySQL
     spring.datasource.url=jdbc:mysql://localhost:3306/gestion_hebergements?useSSL=false&serverTimezone=UTC
     spring.datasource.username=votre_nom_utilisateur
     spring.datasource.password=votre_mot_de_passe
     spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

     # Configurations JPA
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
     ```

3. **Compiler et lancer le projet** :
   - Ouvrez le projet dans IntelliJ IDEA (ou votre IDE préféré).
   - Dans la ligne de commande, compilez le projet avec Maven et démarrez l'application :

     ```bash
     mvn spring-boot:run
     ```

4. **Accéder à l'application** :
   - Rendez-vous sur [http://localhost:8080](http://localhost:8080) dans votre navigateur pour accéder à la page d'accueil.

---

### Structure du Projet

Le projet suit une architecture en couches pour une meilleure organisation :

- **Modèles** : Les entités du système (`Client`, `Hebergement`, `Reservation`) sont définies dans le package `model`.
- **Dépôts** : Les interfaces de `Repository` pour accéder à la base de données sont situées dans le package `repository`.
- **Services** : La logique métier est centralisée dans les services pour chaque entité (`ClientService`, `HebergementService`, `ReservationService`).
- **Contrôleurs** : Les contrôleurs gèrent les requêtes HTTP et redirigent vers les vues Thymeleaf (`HomeController`, `ClientController`, `HebergementController`, `ReservationController`).
- **Templates Thymeleaf** : Les pages HTML avec Thymeleaf pour afficher les données et gérer les formulaires sont situées dans `src/main/resources/templates`.

### Détails des Endpoints

| Endpoint                  | Description                           |
|---------------------------|---------------------------------------|
| `/`                       | Page d'accueil                       |
| `/hebergements`           | Liste des hébergements disponibles   |
| `/reservations`           | Liste des réservations               |
| `/reservations/add`       | Formulaire d'ajout de réservation    |

### Utilisation de l'Application

- **Page d'accueil** : Fournit des liens pour naviguer vers les différentes sections.
- **Inscription d'un Client** : Les utilisateurs peuvent enregistrer un nouveau client en accédant à `/clients/register`.
- **Ajout de Réservation** : Les utilisateurs peuvent ajouter une réservation pour un hébergement et un client spécifiques via `/reservations/add`.


### Technologie et Outils Utilisés

- **Spring Boot** - Framework pour l'application backend
- **Thymeleaf** - Moteur de template pour les vues
- **Spring Data JPA** - Accès aux données et ORM
- **MySQL** - Base de données relationnelle
- **Maven** - Outil de gestion des dépendances


### Auteur

**Grimaa fatimazahra**  

