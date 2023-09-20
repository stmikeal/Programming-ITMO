javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/seviper/ScaryFace.java
javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/seviper/PoisonJab.java
javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/seviper/Lick.java
javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/seviper/BrutalSwing.java

javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/doduo/QuickAttack.java
javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/doduo/Growl.java
javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/doduo/FuryAttack.java
javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/doduo/TriAttack.java

javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/budew/MegaDrain.java
javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/budew/GigaDrain.java
javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/budew/Confide.java
javac -cp bin/lib/Pokemon.jar -d bin/dat src/attack/budew/SludgeBomb.java

javac -cp bin/lib/Pokemon.jar:bin/dat -d bin/dat src/pokemon/seviper/Seviper.java
javac -cp bin/lib/Pokemon.jar:bin/dat -d bin/dat src/pokemon/doduo/Doduo.java
javac -cp bin/lib/Pokemon.jar:bin/dat -d bin/dat src/pokemon/doduo/Dodrio.java
javac -cp bin/lib/Pokemon.jar:bin/dat -d bin/dat src/pokemon/budew/Budew.java
javac -cp bin/lib/Pokemon.jar:bin/dat -d bin/dat src/pokemon/budew/Roselia.java
javac -cp bin/lib/Pokemon.jar:bin/dat -d bin/dat src/pokemon/budew/Roserade.java

javac -cp bin/lib/Pokemon.jar:bin/dat -d bin/run src/test/TestPokemon.java
javac -cp bin/lib/Pokemon.jar:bin/dat -d bin/run src/test/Test.java
javac -cp bin/lib/Pokemon.jar:bin/dat -d bin/run src/assembly/BattleGround.java

java -cp bin/lib/Pokemon.jar:bin/run:bin/dat assembly.BattleGround
