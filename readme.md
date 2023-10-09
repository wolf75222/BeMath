## BeMath 

<img src="https://github.com/wolf75222/BeMath/raw/main/client/BeMathAndroid/app/src/main/res/drawable/bemath_logo.png" width="200" alt="BeMath Logo">


**Concept :** Une application de journal mathématique qui permet aux utilisateurs de partager leur expérience en temps réel lorsqu'ils étudient ou résolvent des problèmes mathématiques, en utilisant des photos et des émojis.

### Arborescence du Projet

```
.
├── BeMath
│   ├── app
│   ├── build.gradle.kts
│   ├── ... (autres fichiers et dossiers d'Android Studio)
├── docs
└── CompteRendu.md
```

### Fonctionnalités

1. **Activités :** 
   - `HomeActivity` : Écran principal montrant l'historique des posts de l'utilisateur.
   - `NewPostActivity` : Écran pour créer un nouveau post.
   - `SavedPostsActivity` : Écran montrant les posts sauvegardés.
   - `StatisticsActivity` : Écran montrant les graphiques et les statistiques basés sur les tags.

2. **Ressources :** 
   - Textes, couleurs, images et émojis stockés dans les ressources. 
   - Internationalisation : Traductions disponibles pour l'anglais et le français.

3. **Notifications :** 
   - Notifications push pour rappeler aux utilisateurs de partager leurs expériences mathématiques.
   
4. **Menu & Préférences :** 
   - Menu dans la barre de statut pour accéder aux paramètres et aux différentes activités.
   - Utilisation des `Preferences` pour sauvegarder les préférences de l'utilisateur.

5. **UI & Fragments :** 
   - Utilisation de fragments pour modulariser l'UI, en particulier pour les posts et les statistiques.
   - Utilisation de `sharedPreferences` pour sauvegarder les posts favoris.

6. **Appareil photo :**
   - Utilisation de la caméra pour permettre aux utilisateurs de prendre des photos de leurs travaux mathématiques.
   
7. **Données & Services :**
   - Base de données SQLite embarquée pour stocker les posts des utilisateurs, les tags et les émojis associés.
   - DAO pour gérer la base de données.
   - `BroadcastReceiver` pour écouter les événements système, comme les rappels pour partager.

### Déroulement :

1. L'utilisateur reçoit une notification lui rappelant de partager son expérience mathématique.
2. L'utilisateur ouvre l'application et prend une photo de son travail mathématique.
3. L'utilisateur ajoute un émoji pour indiquer comment il se sent à ce sujet.
4. L'utilisateur ajoute des tags, comme "algèbre linéaire" ou le nom d'un mathématicien.
5. L'utilisateur publie le post qui est alors ajouté à son historique.
6. L'utilisateur peut naviguer vers l'onglet "Enregistrés" pour voir ses posts sauvegardés ou vers l'onglet "Statistiques" pour voir des graphiques indiquant quel sujet ou quel mathématicien lui pose le plus de problèmes, basé sur les émojis.


D'accord, allons-y !

---

### Stades de Développement :

#### **Stade 1: Initialisation et Préparation**

1. **Configuration de l'environnement :**
   - Installation des outils nécessaires
   - Configuration initiale de l'application Android
   - Révision de la documentation pertinente

2. **Élaboration de la base de données locale :**
   - Choix de la structure de la base de données
   - Définition des tables et relations
   - Mise en place de SQLite avec Android

3. **Conception de l'interface utilisateur :**
   - Esquisse de l'interface utilisateur
   - Définition des activités principales

#### **Stade 2: Fonctionnalités Basiques**

1. **Intégration des notifications :**
   - Création de la fonction de notification
   - Test des notifications (avec différentes priorités)

2. **Publication des photos :**
   - Mise en place de l'appareil photo intégré
   - Configuration de l'espace de stockage des photos

3. **Commentaires avec emojis :**
   - Création d'une interface pour ajouter des commentaires
   - Intégration d'une bibliothèque d'emojis

#### **Stade 3: Fonctionnalités Avancées**

1. **Ajout de tags :**
   - Création d'une base de données pour les tags
   - Mise en place d'un système d'auto-complétion pour les tags

2. **Historique des posts :**
   - Définition de l'ordre d'affichage (chronologique, par popularité)
   - Options de filtrage et de recherche

3. **Section des posts sauvegardés :**
   - Mécanisme d'enregistrement des posts préférés
   - Mise en place d'un accès rapide aux posts enregistrés

#### **Stade 4: Analyse et Visualisation**

1. **Tri des posts par tags :**
   - Mise en place de filtres
   - Affichage de résultats par tag sélectionné

2. **Graphiques et analyses :**
   - Création de graphiques illustrant la distribution des tags
   - Mise en évidence des sujets "douloureux"

3. **Amélioration de l'UX/UI :**
   - Feedback des utilisateurs
   - Optimisation de la navigation

#### **Stade 5: Finalisation**

1. **Tests globaux :**
   - Tests unitaires
   - Tests d'intégration
   - Tests d'acceptation

2. **Optimisation :**
   - Révision des performances de la base de données
   - Minimisation des ressources utilisées

3. **Documentation et déploiement :**
   - Rédaction d'une documentation utilisateur
   - Mise en place de la version finale sur le Play Store

### Tableau des Tâches :



| Tâche                                                     | Responsable | Statut   |
|-----------------------------------------------------------|-------------|----------|
| **Stade 1: Initialisation et Préparation**                 |             |          |
| Installation des outils nécessaires                       | Romain      | En cours |
| Configuration initiale de l'application Android           | Moussa      | En attente |
| Révision de la documentation pertinente                   | Remi        | En attente |
| Choix de la structure de la base de données               | Romain      | En attente |
| Définition des tables et relations                        | Moussa      | En attente |
| Mise en place de SQLite avec Android                      | Remi        | En attente |
| Esquisse de l'interface utilisateur                       | Romain      | En attente |
| Définition des activités principales                      | Moussa      | En attente |
|                                                           |             |          |
| **Stade 2: Fonctionnalités Basiques**                      |             |          |
| Création de la fonction de notification                   | Remi        | En attente |
| Test des notifications                                    | Romain      | En attente |
| Mise en place de l'appareil photo intégré                 | Moussa      | En attente |
| Configuration de l'espace de stockage des photos          | Remi        | En attente |
| Création d'une interface pour ajouter des commentaires    | Romain      | En attente |
| Intégration d'une bibliothèque d'emojis                   | Moussa      | En attente |
|                                                           |             |          |
| **Stade 3: Fonctionnalités Avancées**                      |             |          |
| Création d'une base de données pour les tags              | Remi        | En attente |
| Mise en place d'un système d'auto-complétion pour les tags| Romain      | En attente |
| Définition de l'ordre d'affichage                         | Moussa      | En attente |
| Options de filtrage et de recherche                       | Remi        | En attente |
| Mécanisme d'enregistrement des posts préférés             | Romain      | En attente |
| Mise en place d'un accès rapide aux posts enregistrés     | Moussa      | En attente |
|                                                           |             |          |
| **Stade 4: Analyse et Visualisation**                      |             |          |
| Mise en place de filtres                                  | Remi        | En attente |
| Affichage de résultats par tag sélectionné                | Romain      | En attente |
| Création de graphiques illustrant la distribution des tags| Moussa      | En attente |
| Mise en évidence des sujets "douloureux"                  | Remi        | En attente |
| Feedback des utilisateurs                                 | Romain      | En attente |
| Optimisation de la navigation                             | Moussa      | En attente |
|                                                           |             |          |
| **Stade 5: Finalisation**                                  |             |          |
| Tests unitaires                                           | Remi        | En attente |
| Tests d'intégration                                       | Romain      | En attente |
| Tests d'acceptation                                       | Moussa      | En attente |
| Révision des performances de la base de données           | Remi        | En attente |
| Minimisation des ressources utilisées                     | Romain      | En attente |
| Rédaction d'une documentation utilisateur                 | Moussa      | En attente |
| Mise en place de la version finale sur le Play Store      | Romain      | En attente |



---

**BeMath** offre aux étudiants et aux amateurs de mathématiques un moyen unique de suivre leur progression et de visualiser leurs défis. Le compte rendu, `CompteRendu.md`, expliquera en détail la mise en œuvre de chaque fonctionnalité, les défis rencontrés et les solutions adoptées.
