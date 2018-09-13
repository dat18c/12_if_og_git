# 12 if og Git

## Agenda
* Opsamling på for loops
* Class diagram
* if sætninger
* Opsætning af Git og upload til GitHub

## If sætninger
If sætninger bruges til at vælge mellem flere program flow.
````
if (a<10)
{
  Det der skal ske, hvis a er mindre end 10
}
else if (a==10)
{
  Det der skal ske, hvis a er lig med 10
}
else //a>10
{
  Det er skal ske, hvis ingen af de to første er sande, dvs. a>10
}
````
  Udtrykket i parentes skal kunne udtrykkes som sandt eller falsk. Det kaldes et boolsk udtryk.
  
  Boolske operatorer
  `````
  >
  >=
  ==
  !=
  <
  <=
  && - logisk AND
  || - logisk OR (ALT + i på dansk Mac)
  ! - logisk NOT, dvs. negation
`````
### Øvelser

Exercises 1 - 7 på side 335 - 336.

Self check 2 på side 328 er god til at få rutine.

## Git og GitHub

 Jeres Little Animal Horror Zoo opgave skal afleveres på _GitHub_.
 I dag skal i lære hvordan dette gøres.
 
* Installer Git
* Konfigurer standard editor - eller lær VI
* Lav repository til aflevering af Animal Horror Zoo
* Upload diagrammer mandag
* Upload kode senest onsdag kl. 16

### Upload made simple
* Lav et public repository i GitHub. Husk at inkludere en .gitignore til Java, så I slipper for upload af .class filer.
* Find kataloget med afleveringsfilerne i Git Bash.
* Lav kommandoer i Git Bash (Git's egen unix-lignende kommandolinie) til upload af filerne.
* Skal der tilføjes flere filer gentages git add, git commit, og git push. Det opdaterer GitHub med den nyeste version af filerne i kataloget - og fjerne slettede filer.
 
## Download & Install

 * https://git-scm.com/
### Video tutorials på Lynda.com
* [Installing Git on a Mac](https://www.lynda.com/Git-tutorials/Installing-Git-Mac/100222/111253-4.html?srchtrk=index%3a3%0alinktypeid%3a2%0aq%3agit%0apage%3a1%0as%3arelevance%0asa%3atrue%0aproducttypeid%3a2)
* [Installing Git on Windows](https://www.lynda.com/Git-tutorials/Installing-Git-Windows/100222/111254-4.html?srchtrk=index%3a3%0alinktypeid%3a2%0aq%3agit%0apage%3a1%0as%3arelevance%0asa%3atrue%0aproducttypeid%3a2)
* [Installing Git on Linux](https://www.lynda.com/Git-tutorials/Installing-Git-Linux/100222/111255-4.html?srchtrk=index%3a3%0alinktypeid%3a2%0aq%3agit%0apage%3a1%0as%3arelevance%0asa%3atrue%0aproducttypeid%3a2)
* [Configuring Git](https://www.lynda.com/Git-tutorials/Configuring-Git/100222/111256-4.html?srchtrk=index%3a3%0alinktypeid%3a2%0aq%3agit%0apage%3a1%0as%3arelevance%0asa%3atrue%0aproducttypeid%3a2) 

## Komandoer vi har brugt i dag:

### Terminal/Console komandoer
````
  cd   // Change Directory
  cd ..   // one folder back
  pwd   // Print working directory
````
### Git Komandoer
Dette skrives i Git Bash konsollen (windows)    
Terminalen (Mac)
````
  $ git init
  $ git add .
  $ git commit -m "besked"
````
Opret forbindelse til jeres online GitHub Repository og upload filerne
````
  $ git remote add origin https://urlTilJeresGithubRepository
  $ git push origin master
````
Cloning af et eksisterende online Github Repository (nyttigt hvis andre skal have afleveringen ned i samme udgave).
````
  $ git clone https://urlTilJeresGithubRepository
````
Senere kan I opdatere afleveringen med filerne, som de ser ud i kataloget på pc'en
````
  $ git add .
  $ git commit -m "besked"
  $ git push origin master
````
