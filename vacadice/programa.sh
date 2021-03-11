#!/bin/bash
if [$#-eq0] then
  /usr/games/fortune | /usr/games/cowsay
else
  /usr/games/cowsay "$@"
fi
