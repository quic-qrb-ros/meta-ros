# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "AWS Kinesis stream management library intended for use with the Kinesis Video Producer SDK"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "http://wiki.ros.org/kinesis_manager"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "kinesis_manager"
ROS_BPN = "kinesis_manager"

ROS_BUILD_DEPENDS = " \
    aws-common \
    boost \
    curl \
    log4cplus \
    openssl \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = " \
    aws-common \
    boost \
    curl \
    log4cplus \
    openssl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    aws-common \
    boost \
    curl \
    log4cplus \
    openssl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/aws-gbp/kinesis_manager-release/archive/release/dashing/kinesis_manager/2.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/kinesis_manager"
SRC_URI = "git://github.com/aws-gbp/kinesis_manager-release;${ROS_BRANCH};protocol=https"
SRCREV = "dc0a653d314294d4626e30849e9b35ec828ad4ae"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
