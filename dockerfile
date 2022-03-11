FROM: centos:latest
run: apt-get  update && apt install -y
run: apt-get install vim
run: mkdir lepro
WORKDIR: lepro/
run: touch grespo
run: chmod +x grespo
