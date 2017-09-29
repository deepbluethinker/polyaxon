# -*- coding: utf-8 -*-
from __future__ import absolute_import, division, print_function

import tensorflow as tf
import polyaxon as plx

from polyaxonfile.manager import prepare_experiments


def experiment_fn(output_dir):
    """Creates an experiment using cnn for MNIST dataset classification task.

    References:
        * Y. LeCun, L. Bottou, Y. Bengio, and P. Haffner. "Gradient-based learning applied to
        document recognition." Proceedings of the IEEE, 86(11):2278-2324, November 1998.
    Links:
        * [MNIST Dataset] http://yann.lecun.com/exdb/mnist/
    """
    plx.datasets.mnist.prepare('../data/mnist')

    config = './yaml_configs/conv_mnist.yml'
    return prepare_experiments(config)


def main(*args):
    plx.experiments.run_experiment(experiment_fn=experiment_fn,
                                   output_dir="/tmp/polyaxon_logs/conv_mnsit",
                                   schedule='continuous_train_and_eval')


if __name__ == "__main__":
    tf.logging.set_verbosity(tf.logging.INFO)
    tf.app.run()
