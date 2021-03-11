#!/bin/bash
if [$#-eq0]
then
  figlet
else
  figlet "$@"
fi
