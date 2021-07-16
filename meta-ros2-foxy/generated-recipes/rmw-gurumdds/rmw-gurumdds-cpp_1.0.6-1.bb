# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Implement the ROS middleware interface using GurumNetworks GurumDDS static code generation in C++."
AUTHOR = "Youngjin Yun <youngjin@gurum.cc>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_gurumdds"
ROS_BPN = "rmw_gurumdds_cpp"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gurumdds-2.7} \
    gurumdds-cmake-module \
    rcutils \
    rmw \
    rmw-gurumdds-shared-cpp \
    rosidl-generator-dds-idl \
    rosidl-runtime-c \
    rosidl-runtime-cpp \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    rosidl-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gurumdds-2.7} \
    gurumdds-cmake-module \
    rmw-gurumdds-shared-cpp \
    rosidl-runtime-c \
    rosidl-runtime-cpp \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rcutils \
    rmw \
    rmw-gurumdds-shared-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmw_gurumdds-release/archive/release/foxy/rmw_gurumdds_cpp/1.0.6-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/rmw_gurumdds_cpp"
SRC_URI = "git://github.com/ros2-gbp/rmw_gurumdds-release;${ROS_BRANCH};protocol=https"
SRCREV = "01f3717332d13c0afb4b38ddde0abf8a74e5d04e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
