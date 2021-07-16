# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Implement the ROS middleware interface using RTI Connext static code generation in C++."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_connext"
ROS_BPN = "rmw_connext_cpp"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-rti-connext-dds-5.3.1} \
    connext-cmake-module \
    rcutils \
    rmw \
    rmw-connext-shared-cpp \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-generator-dds-idl \
    rosidl-typesupport-connext-c \
    rosidl-typesupport-connext-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-rti-connext-dds-5.3.1} \
    connext-cmake-module \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-typesupport-connext-c \
    rosidl-typesupport-connext-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    rosidl-cmake-native \
"

ROS_EXEC_DEPENDS = " \
    rcutils \
    rmw \
    rmw-connext-shared-cpp \
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

# matches with: https://github.com/ros2-gbp/rmw_connext-release/archive/release/dashing/rmw_connext_cpp/0.7.6-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/rmw_connext_cpp"
SRC_URI = "git://github.com/ros2-gbp/rmw_connext-release;${ROS_BRANCH};protocol=https"
SRCREV = "145eb0a53cf74574087f6e07839bcec04dc1c4f8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
