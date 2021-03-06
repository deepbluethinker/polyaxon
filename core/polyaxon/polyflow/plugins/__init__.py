#!/usr/bin/python
#
# Copyright 2018-2020 Polyaxon, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

from marshmallow import fields

import polyaxon_sdk
from polyaxon.polyflow.notifications import NotificationSchema
from polyaxon.schemas.base import BaseConfig, BaseCamelSchema


class PluginsSchema(BaseCamelSchema):
    auth = fields.Bool(allow_none=True)
    docker = fields.Bool(allow_none=True)
    shm = fields.Bool(allow_none=True)
    collect_artifacts = fields.Bool(allow_none=True)
    collect_logs = fields.Bool(allow_none=True)
    collect_resources = fields.Bool(allow_none=True)
    sync_statuses = fields.Bool(allow_none=True)
    log_level = fields.Str(allow_none=True)
    notifications = fields.List(fields.Nested(NotificationSchema), allow_none=True)

    @staticmethod
    def schema_config():
        return V1Plugins


class V1Plugins(BaseConfig, polyaxon_sdk.V1Plugins):
    IDENTIFIER = "plugins"
    SCHEMA = PluginsSchema
    REDUCED_ATTRIBUTES = [
        "auth",
        "docker",
        "shm",
        "collectArtifacts",
        "collectLogs",
        "collectResources",
        "syncStatuses",
        "logLevel",
        "notifications",
    ]
