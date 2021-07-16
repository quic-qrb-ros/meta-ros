# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "unaccepted patch for collada_urdf"
AUTHOR = "Yohei Kakiuchi <youhei@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/collada_urdf_jsk_patch"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_3rdparty"
ROS_BPN = "collada_urdf_jsk_patch"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libgts} \
    angles \
    assimp-devel \
    class-loader \
    cmake-modules \
    collada-dom \
    collada-parser \
    collada-urdf \
    geometric-shapes \
    git \
    kdl-parser \
    mk \
    pluginlib \
    python3-catkin-tools \
    resource-retriever \
    roscpp \
    rostest \
    tf \
    unzip \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libgts} \
    angles \
    assimp-devel \
    class-loader \
    collada-dom \
    collada-parser \
    collada-urdf \
    geometric-shapes \
    kdl-parser \
    pluginlib \
    python3-catkin-tools \
    resource-retriever \
    roscpp \
    tf \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_3rdparty-release/archive/release/noetic/collada_urdf_jsk_patch/2.1.21-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/collada_urdf_jsk_patch"
SRC_URI = "git://github.com/tork-a/jsk_3rdparty-release;${ROS_BRANCH};protocol=https"
SRCREV = "64b5da77fc7dddeeb5903b3a771ca7b75d974118"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
