require ${COREBASE}/meta/recipes-core/images/core-image-minimal.bb

inherit extrausers

EXTRA_USERS_PARAMS = "\
	useradd -p '' tiago; \
	groupadd tiago; \
		"

IMAGE_FEATURES = "ssh-server-openssh debug-tweaks package-management"

IMAGE_INSTALL:append = " \
	cmake-example \
	python3-paramiko \
	"