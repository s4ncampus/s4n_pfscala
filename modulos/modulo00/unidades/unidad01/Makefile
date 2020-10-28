all: S4N-PFScala-m00-u01-s01.pdf S4N-PFScala-m00-u01-s01.ipynb S4N-PFScala-m00-u01-s01.html

S4N-PFScala-m00-u01-s01.pdf: S4N-PFScala-m00-u01-s01.md
	pandoc -o $@ $<

S4N-PFScala-m00-u01-s01.html: S4N-PFScala-m00-u01-s01.md
	pandoc -o $@ $<

S4N-PFScala-m00-u01-s01.ipynb: S4N-PFScala-m00-u01-s01.md
	pandoc -o $@ $<

clean:
	rm -f S4N-PFScala-m00-u01-s01.pdf S4N-PFScala-m00-u01-s01.ipynb

