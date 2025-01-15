# Cucumber Example Project für das Paper "Requirements Engineering: User Stories und Epics in Vorgehensmodellen"

Dieses Repository enthält eine minimale Beispiel-Projektstruktur um das Cucumber Beispiel aus dem Paper
"Requirements Engineering: User Stories und Epics in Vorgehensmodellen" zu testen.

Das Projekt enthält für diesen Zweck ein [Dockerfile](Dockerfile) welches die Initialisierung der Testumgebung und das Ausführen des Tests übernimmt.

Um die Tests zu starten, muss das Dockerfile lediglich mit folgenden Befehlen zuerst gebaut

```
sudo docker build -t cucumber-example .
```

und dann mit folgenden Befehls ausgeführt werden:

```
sudo docker run -it --rm cucumber-example
```

Der Befehl `docker build` erstellt ein Docker-Image mit dem Namen `cucumber-example` basiereden auf dem Dockerfile.
Diese Image wird dann mit dem Befehl `docker run` ausgeführt. Dabei wird der Befehl `docker run` mit folgenden Optionen erweitert:
- `-it`: Der Container wird interaktiv gestartet. Das bedeutet, dass der Container eine Konsole erstellt
  und die Konsole mit dem Container verbunden wird.
- `--rm`: Der Container wird nach dem Beenden des Befehls automatisch gelöscht.
