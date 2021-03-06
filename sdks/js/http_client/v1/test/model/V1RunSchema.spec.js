// Copyright 2018-2020 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/*
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * OpenAPI spec version: 1.0.5
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.10
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.PolyaxonSdk);
  }
}(this, function(expect, PolyaxonSdk) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('V1RunSchema', function() {
      beforeEach(function() {
        instance = new PolyaxonSdk.V1RunSchema();
      });

      it('should create an instance of V1RunSchema', function() {
        // TODO: update the code to test V1RunSchema
        expect(instance).to.be.a(PolyaxonSdk.V1RunSchema);
      });

      it('should have the property job (base name: "job")', function() {
        // TODO: update the code to test the property job
        expect(instance).to.have.property('job');
        // expect(instance.job).to.be(expectedValueLiteral);
      });

      it('should have the property service (base name: "service")', function() {
        // TODO: update the code to test the property service
        expect(instance).to.have.property('service');
        // expect(instance.service).to.be(expectedValueLiteral);
      });

      it('should have the property dag (base name: "dag")', function() {
        // TODO: update the code to test the property dag
        expect(instance).to.have.property('dag');
        // expect(instance.dag).to.be(expectedValueLiteral);
      });

      it('should have the property tf_job (base name: "tf_job")', function() {
        // TODO: update the code to test the property tf_job
        expect(instance).to.have.property('tf_job');
        // expect(instance.tf_job).to.be(expectedValueLiteral);
      });

      it('should have the property pytorch_job (base name: "pytorch_job")', function() {
        // TODO: update the code to test the property pytorch_job
        expect(instance).to.have.property('pytorch_job');
        // expect(instance.pytorch_job).to.be(expectedValueLiteral);
      });

      it('should have the property mpi_job (base name: "mpi_job")', function() {
        // TODO: update the code to test the property mpi_job
        expect(instance).to.have.property('mpi_job');
        // expect(instance.mpi_job).to.be(expectedValueLiteral);
      });

      it('should have the property dask (base name: "dask")', function() {
        // TODO: update the code to test the property dask
        expect(instance).to.have.property('dask');
        // expect(instance.dask).to.be(expectedValueLiteral);
      });

      it('should have the property spark (base name: "spark")', function() {
        // TODO: update the code to test the property spark
        expect(instance).to.have.property('spark');
        // expect(instance.spark).to.be(expectedValueLiteral);
      });

      it('should have the property flink (base name: "flink")', function() {
        // TODO: update the code to test the property flink
        expect(instance).to.have.property('flink');
        // expect(instance.flink).to.be(expectedValueLiteral);
      });

      it('should have the property ruy (base name: "ruy")', function() {
        // TODO: update the code to test the property ruy
        expect(instance).to.have.property('ruy');
        // expect(instance.ruy).to.be(expectedValueLiteral);
      });

    });
  });

}));
