## Diagramme de classes

```mermaid
    classDiagram
    class GrilleSudoku
    GrilleSudoku : +int id
    GrilleSudoku : +int[81] numeros
    GrilleSudoku : +boolean[81] estDonne
    GrilleSudoku : +GrilleSudoku()
    GrilleSudoku : +EstSolvable()
    class SujetSudomath
    SujetSudomath : +int id
    SujetSudomath : +String commentaire
    SujetSudomath : +Exercice[] exercices
    SujetSudomath : +Utilisateur auteur
    class Bloc
    Exercice o-- Bloc
    Bloc : +String[] enonces
    Bloc : +String[][] variables
    Bloc : +int[][] reponses
    Bloc : +boolean[] isVariable
    Bloc : +int[][] lienSolutionVariable
    class Exercice
    Exercice : +int id
    Exercice : +bloc[] blocs
    Exercice : +String niveau
    Exercice : +String theme
    SujetSudomath o-- Exercice
    ExemplaireSudomath o-- ModeleLaTeX
    SujetSudomath o-- Utilisateur
    class Utilisateur
    Utilisateur : +int id
    Utilisateur : +String login
    Utilisateur : +String hashMotDePasse
    class ExemplaireSudomath
    ExemplaireSudomath : +GrilleSudoku[] grilles
    ExemplaireSudomath : +SujetSudomath sujet
    ExemplaireSudomath : +Utilisateur proprietaire
    ExemplaireSudomath o-- GrilleSudoku
    ExemplaireSudomath o-- SujetSudomath
    class ModeleLaTeX
    ModeleLaTeX : +int id
    ModeleLaTeX : +String[] modele
    ModeleLaTeX : +Utilisateur auteur

```

## Diagramme d'activité

```mermaid
graph LR
    A[Christmas] -->|Get money| B(Go shopping)
    B --> C{Let me think}
    C -->|One| D[Laptop]
    C -->|Two| E[iPhone]
    C -->|Three| F[fa:fa-car Car]

```
