require ${COREBASE}/meta/recipes-core/images/core-image-minimal.bb

inherit extrausers

EXTRA_USERS_PARAMS = " \
	usermod -p '\$6\$123456789\$7Muh1eobhfY.WJWNa0NMTDCFcUzuhubO1LwZKHRLUc8NNbfv6jaWOJ8yi2savFhhDvcgfmArtKfjPeCRItBpm1' root; \
	useradd -p '\$6\$987654321\$5OVXjWz5/uffeT175R0.ITQ20kfIV/JREiO3FZn17.Pxo9ywwhUTUiOos9lsmC484yzVsHcjHmI3hfgwN4Dze0' tiago "
# root: senhaforte -> mkpasswd -m sha-512 senhaforte -s "123456789"
# tiago: maisforte -> mkpasswd -m sha-512 maisforte -s "987654321"

IMAGE_FEATURES = "ssh-server-openssh package-management"
# debug-tweaks

IMAGE_INSTALL:append = " \
	cmake-example \
	python3-paramiko \
	"