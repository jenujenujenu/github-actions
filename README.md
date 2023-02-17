# Übung: Workflows

## Übung 1: Erster Workflow

1. Forken Sie dieses Repository, um eine beispielhafte Implementierung zu erhalten. 
1. Erstellen Sie dann einen **Frontend** Workflow, der: 
	1. Ausgeführt wird, sobald Änderungen in Ihrem Repository erkannt werden.
	1. Den Inhalt des Repository ins Arbeitsverzeichnis lädt.
	1. Den Inhalt der Datei `src/frontend/app.js` auf die Konsole druckt.
1. Testen Sie Ihren Workflow, indem Sie die Konfigurationsdatei in das Repository pushen.


## Übung 2: Frontend und Backend Build

1. Erweitern Sie den **Frontend** Workflow, sodass er: 
	1. Nach dem Checkout Node.js initialisiert und `node src/frontend/app.js` ausführt.
	1. Die Datei `src/frontend/app.js` in den neuen Ordner `dist` kopiert und dabei eine Kommentarzeile (`//`) als erste Zeile in die Datei einfügt. Diese sollte den Zeitpunkt des Build enthalten.
	1. Statt `src/frontend/app.js` nun `dist/app.js` ausführt, um einen Test zu simulieren.
1. Erstellen Sie dann einen **Backend** Workflow, der das Backend in gleicher Weise baut und testet: 
	1. Herunterladen des Repository Inhalts, Initialisierung von Python und Erstellen des dist Ordners.
	1. Kopieren der Datei `src/backend/run.py`. Dabei Einfügen einer Kommentarzeile (`#`) mit Zeitpunkt des Build. Abschließend Ausführen von `python dist/run.py` zum Test.


## Übung 3: Erstellen eines Bundles

1. Erweitern Sie den Frontend und Backend Workflow, dass Sie:
	1. Den `dist` Ordner als Artefakt hochladen und bereitstellen.
1. Erstellen Sie dann einen Bundle Workflow, der: 
	1. Einen Ordner `dist` erstellt und beide Artefakte in die Ordner `dist/frontend` und `dist/backend` herunterlädt.
	1. Eine Datei `creation.txt` erstellt, die den Zeitpunkt der Bundle-Erstellung dokumentiert und sie zusammen mit dem `dist` Ordner in ein Archiv `bundle.zip` sichert.
	1. Den Inhalt des Repository in den Ordner `repo` herunterlädt, die Datei `bundle.zip` dorthin verschiebt und sie mittels **git** in das Repository pushed. Dabei wird die ID (SHA) des Auslösers in der Commit-Message verwendet.


## Übung 4: Erstellen einer Dokumentation

1. Fügen Sie Ihrem Repository die Java Klasse `Calculator1` aus der letzten Vorlesung hinzu. Dazu können Sie: 
	1. Entweder Ihren Fork up-to-date bringen
	1. Oder einen neuen Fork erstellen
	1. Alternativ können Sie auch eine eigene Java Klasse mit Unit Test und Javadoc Kommentaren einfügen
1. Erweitern Sie den Workflow, dass er: 
	1. Das Bundle nicht mehr in die main branch pushed (wird später wieder eingefügt)
	1. Automatisch eine Dokumentation aus den vorhandenen Javadoc Kommentaren erstellt
	1. Diese Dokumentation als Artefakt hochlädt


## Übung 5: Tests durchführen 

1. Erweitern Sie den Workflow, dass er: 
	1. Die vorhandenen Tests unter `./src/calculator/` ausführt
	1. Das erstellte Testergebnis (`./src/calculator/build/reports/tests/test/`) als Artefakt hochlädt
