require ${COREBASE}/meta/recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL:append = " \
	cmake-example \
	python3-paramiko \
	"